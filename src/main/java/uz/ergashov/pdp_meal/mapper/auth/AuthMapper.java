package uz.ergashov.pdp_meal.mapper.auth;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import uz.ergashov.pdp_meal.dto.auth.AuthCreateDto;
import uz.ergashov.pdp_meal.dto.auth.AuthDto;
import uz.ergashov.pdp_meal.dto.auth.AuthUpdateDto;
import uz.ergashov.pdp_meal.entity.auth.User;
import uz.ergashov.pdp_meal.mapper.BaseMapper;

import java.util.List;

/**
 * Created by Elyor Ergashov
 *
 * @author : mreed
 * @date : 3/2/2022
 * @project : mealDeliver
 */
@Component
@Mapper(componentModel = "spring")

public interface AuthMapper extends BaseMapper<User, AuthDto, AuthCreateDto, AuthUpdateDto> {

    @Override
     AuthDto toDto(User user) ;

    @Override
     List<AuthDto> toDto(List<User> e) ;

    @Override
    @Mapping(target = "language",ignore = true)
    @Mapping(target = "role",ignore = true)
    @Mapping(target = "status",ignore = true)
    @Mapping(target = "position",ignore = true)
    @Mapping( target =  "department", ignore = true)
     User fromCreateDto(AuthCreateDto authCreateDto) ;

    @Override
     User fromUpdateDto(AuthUpdateDto authUpdateDto) ;
}
