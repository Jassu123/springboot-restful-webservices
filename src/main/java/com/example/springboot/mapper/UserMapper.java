package com.example.springboot.mapper;
import com.example.springboot.dto.UserDto;
import com.example.springboot.entity.User;

public class UserMapper {

    //convert user entity into UserDto object
    public static UserDto mapToUserDto(User user) {

        UserDto userDto = new UserDto(user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail());

        return userDto;
    }
    //convert user dto into User object
    public static User mapToUser(UserDto userDto) {

        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
