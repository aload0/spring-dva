package io.github.aload0.spring.dva;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertyResolver;

public class DvaContextImpl implements Context {

  private final String header;
  private final Environment environment;
  private final BeanFactory beanFactory;
  private final PropertyResolver propertyResolver;
  private final NameConvention nameConvention;
  private final MethodAccessorFactory methodAccessorFactory;

  DvaContextImpl(String header, Environment environment, BeanFactory beanFactory,
      PropertyResolver propertyResolver,
      NameConvention nameConvention, MethodAccessorFactory methodAccessorFactory) {
    this.header = header;
    this.environment = environment;
    this.beanFactory = beanFactory;
    this.propertyResolver = propertyResolver;
    this.nameConvention = nameConvention;
    this.methodAccessorFactory = methodAccessorFactory;
  }

  @Override
  public String getHeader() {
    return header;
  }

  @Override
  public Environment getEnvironment() {
    return environment;
  }

  @Override
  public BeanFactory getBeanFactory() {
    return beanFactory;
  }

  @Override
  public PropertyResolver getPropertyResolver() {
    return propertyResolver;
  }

  @Override
  public NameConvention getNameConvention() {
    return nameConvention;
  }

  @Override
  public MethodAccessorFactory getMethodAccessorFactory() {
    return methodAccessorFactory;
  }
}
