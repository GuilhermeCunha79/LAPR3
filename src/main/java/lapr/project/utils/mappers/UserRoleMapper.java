package lapr.project.utils.mappers;

import lapr.project.auth.domain.UserRole;
import lapr.project.utils.DTO.UserRoleDTO;

import java.util.ArrayList;
import java.util.List;

public class UserRoleMapper {

    public UserRoleDTO toDTO(UserRole role)
    {
        return new UserRoleDTO(role.getId(),role.getDescription());
    }

    public List<UserRoleDTO> toDTO(List<UserRole> roles)
    {
        List<UserRoleDTO> rolesDTO = new ArrayList<>();
        for(UserRole role:roles)
        {
            rolesDTO.add(this.toDTO(role));
        }
        return rolesDTO;
    }
}