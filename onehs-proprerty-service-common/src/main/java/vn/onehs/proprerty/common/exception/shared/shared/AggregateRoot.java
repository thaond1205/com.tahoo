package vn.onehs.proprerty.common.exception.shared.shared;

public interface AggregateRoot<T> extends Entity<T> {
    T clone();
}
