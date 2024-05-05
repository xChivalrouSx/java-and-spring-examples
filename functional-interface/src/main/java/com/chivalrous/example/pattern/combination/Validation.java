package com.chivalrous.example.pattern.combination;

import java.util.function.Function;

public interface Validation<T> extends Function<T, ValidationResult> {

}
