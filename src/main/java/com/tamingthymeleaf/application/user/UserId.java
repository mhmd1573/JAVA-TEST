package com.tamingthymeleaf.application.user;

import io.github.wimdeblauwe.jpearl.AbstractEntityId;
import java.util.UUID;

public class UserId extends AbstractEntityId<UUID> {


   protected UserId() {
   }

   public UserId(UUID id) {
       super(id);
   }
}