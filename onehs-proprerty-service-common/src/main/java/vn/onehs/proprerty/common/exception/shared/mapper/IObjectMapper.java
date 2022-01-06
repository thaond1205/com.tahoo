package vn.onehs.proprerty.common.exception.shared.mapper;

import java.util.List;
import java.util.Set;

public interface IObjectMapper<S, D> {

    S to(D obj);

    D from(S obj);

    List<S> to(List<D> entities);

    List<D> from(List<S> dtos);

    Set<S> to(Set<D> entities);

    Set<D> from(Set<S> dtos);

}
