package br.com.nrzty.GenshinImpactAPI.adapters.inbound.assembler;

import br.com.nrzty.GenshinImpactAPI.adapters.inbound.controller.CharacterController;
import br.com.nrzty.GenshinImpactAPI.adapters.inbound.dto.CharacterDTO;
import br.com.nrzty.GenshinImpactAPI.domain.character.CharacterEntity;
import br.com.nrzty.GenshinImpactAPI.utils.mappers.CharacterMapper;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class CharacterModelAssembler extends RepresentationModelAssemblerSupport<CharacterEntity, CharacterDTO> {

    public CharacterModelAssembler() {
        super(CharacterController.class, CharacterDTO.class);
    }

    @Override
    public CharacterDTO toModel(CharacterEntity entity) {
        CharacterDTO characterDTO = CharacterMapper.toDTO(entity);
        characterDTO.add(linkTo(methodOn(CharacterController.class).getCharacterById(entity.getId())).withRel("Get Character By Id"));
        characterDTO.add(linkTo(methodOn(CharacterController.class).listAllCharacters()).withRel("All Characters"));
        characterDTO.add(linkTo(methodOn(CharacterController.class).deleteCharacter(entity.getId())).withRel("Delete Character"));
        characterDTO.add(linkTo(methodOn(CharacterController.class).addCharacter(characterDTO)).withRel("Add Character"));
        characterDTO.add(linkTo(methodOn(CharacterController.class).updateCharacter(entity.getId(), characterDTO)).withRel("Update Character"));
        return characterDTO;
    }
}
