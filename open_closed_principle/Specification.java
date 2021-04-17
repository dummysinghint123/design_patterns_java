package designPatterns.openClosedPrinciple;

//we introduce two new interfaces that are open for extension
interface Specification<T>
{
boolean isSatisfied(T item);
}
