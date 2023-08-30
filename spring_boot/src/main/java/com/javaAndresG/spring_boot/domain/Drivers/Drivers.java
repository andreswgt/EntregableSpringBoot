package com.javaAndresG.spring_boot.domain.Drivers;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Drivers {
    private UUID uuid = UUID.randomUUID();

    private String code;

    private String name;

    private String cellphone;

    private String email;

    private Boolean enabled = Boolean.TRUE;

    private Boolean is_deleted = Boolean.FALSE;

    private LocalDateTime deleted_at;


}
