package designPatterns.dependencyInversionPrinciple;

import java.util.List;

interface RelationshipBrowser
{
  List<Person> findAllChildrenOf(String name);
}