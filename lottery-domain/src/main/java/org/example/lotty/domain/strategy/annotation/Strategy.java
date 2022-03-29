package org.example.lotty.domain.strategy.annotation;

import org.example.lotty.common.Constants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 抽奖策略模型注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Strategy {

    Constants.StrategyMode strategyMode();

}
