package com.healthyMoves.healthyMoves.command;

import com.healthyMoves.healthyMoves.enums.AuthProvider;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCO {
    @NotBlank(message = "email {default.validation.not.blank}")
    String email;
    String socialId;
    AuthProvider provider;
}
