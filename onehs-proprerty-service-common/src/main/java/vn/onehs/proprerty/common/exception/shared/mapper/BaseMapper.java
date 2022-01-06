package vn.onehs.proprerty.common.exception.shared.mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
public class BaseMapper {
    public static final String FORMAT_PATTERN = "yyyy-MM-dd";

    public static final String DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm";

    public Instant fromLocalDate(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.atStartOfDay(ZoneId.systemDefault()).toInstant();
    }

    public String fromDate(Date value) {
        if (value != null) {
            return value.toLocalDate().format(DateTimeFormatter.ofPattern(FORMAT_PATTERN));
        }
        return null;
    }

//    public Date toDate(String value) {
//        if (!StringUtils.isBlank(value)) {
//            try {
//                return Date.valueOf(LocalDate.parse(value, DateTimeFormatter.ofPattern(FORMAT_PATTERN)));
//            } catch (Exception ex) {
//                return null;
//            }
//        }
//        return null;
//    }

    public String trimStr(String value){
        if (value != null) {
            try {
                return value.trim();
            } catch (Exception ex) {
                return null;
            }
        }
        return null;
    }
}
