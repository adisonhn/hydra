/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.addthis.hydra.job.spawn.search;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The json result of a search on a single 'file'
 */
public class SearchResult {

    @JsonProperty
    private final String description;

    @JsonProperty
    private final String id;

    @JsonProperty
    private final List<AdjacentMatchesBlock> results;

    public SearchResult(String id, String description, List<AdjacentMatchesBlock> results) {
        this.id = id;
        this.description = description;
        this.results = results;
    }
}
