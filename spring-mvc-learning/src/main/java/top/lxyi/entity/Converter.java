package top.lxyi.entity;

public interface Converter<S,T> {
    T convert(S source);
}
