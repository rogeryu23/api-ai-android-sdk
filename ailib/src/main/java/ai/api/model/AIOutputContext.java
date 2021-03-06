package ai.api.model;

/***********************************************************************************************************************
 *
 * API.AI Android SDK - client-side libraries for API.AI
 * =================================================
 *
 * Copyright (C) 2014 by Speaktoit, Inc. (https://www.speaktoit.com)
 * https://www.api.ai
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************/

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashMap;

public class AIOutputContext implements Serializable {

    @SerializedName("name")
    private String name;

    @SerializedName("parameters")
    private HashMap<String, JsonElement> parameters;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HashMap<String, JsonElement> getParameters() {
        return parameters;
    }

    public void setParameters(final HashMap<String, JsonElement> parameters) {
        this.parameters = parameters;
    }
}
