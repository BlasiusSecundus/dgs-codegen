package com.netflix.graphql.dgs.codegen.cases.dataClassFieldDocs.expected.client

import com.netflix.graphql.dgs.client.codegen.InputValueSerializerInterface
import com.netflix.graphql.dgs.codegen.GraphQLProjection
import com.netflix.graphql.dgs.codegen.cases.dataClassFieldDocs.expected.types.MovieFilter

public class QueryProjection(
  inputValueSerializer: InputValueSerializerInterface? = null,
) : GraphQLProjection(inputValueSerializer) {
  public fun search(movieFilter: MovieFilter, _projection: MovieProjection.() -> MovieProjection):
      QueryProjection {
    field("search", MovieProjection(inputValueSerializer), _projection, "movieFilter" to
        movieFilter)
    return this
  }
}
