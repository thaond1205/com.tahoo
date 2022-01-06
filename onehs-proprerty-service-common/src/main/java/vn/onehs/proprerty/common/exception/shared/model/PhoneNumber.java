package vn.onehs.proprerty.common.exception.shared.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class PhoneNumber {

    String phoneType;

    String number;

    List<AdditionalPhone> additionalPhones;
}
