/*
 * Copyright 2012 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk.sdk;

/**
 * The {@code IndexCollectionArgs} class contains arguments for retrieving 
 * indexes from a collection (see {@link Service#getIndexes}).
 */
public class IndexCollectionArgs extends CollectionArgs {
    
    /**
     * Class constructor.
     */
    public IndexCollectionArgs() { super(); }
    
    /* BEGIN AUTOGENERATED CODE */
    
    /**
     * Sets the maximum number of entries to return.
     * 
     * @param count
     *      The maximum number of entries to return. To return all entries, specify -1.
     */
    public void setCount(int count) {
        super.setCount(count);
    }
    
    /**
     * Sets whether to omits certain index details to provide a faster response.
     * 
     * @param summarize
     *      {@code true} to omit index details for a faster response,
     *      {@code false} if not.
     */
    public void setSummarize(boolean summarize) {
        this.put("summarize", summarize);
    }
    
    /* END AUTOGENERATED CODE */
}