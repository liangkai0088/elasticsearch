/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.rankeval;

import org.elasticsearch.search.SearchHit;

/**
 * Classes implementing this interface provide a means to compute the quality of a result list
 * returned by some search.
 * 
 * RelevancyLevel specifies the type of object determining the relevancy level of some known docid.
 * */
public interface RankedListQualityMetric extends Evaluator {

    /**
     * Returns a single metric representing the ranking quality of a set of returned documents
     * wrt. to a set of document Ids labeled as relevant for this search.
     *
     * @param hits the result hits as returned by some search
     * @return some metric representing the quality of the result hit list wrt. to relevant doc ids.
     * */
    public EvalQueryQuality evaluate(SearchHit[] hits, RatedQuery intent);
}
