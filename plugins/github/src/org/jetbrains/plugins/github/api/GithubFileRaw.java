/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
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
package org.jetbrains.plugins.github.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * @author Aleksey Pivovarov
 */
@SuppressWarnings({"UnusedDeclaration", "ConstantConditions"})
public class GithubFileRaw implements DataConstructor<GithubFile> {
  @Nullable public String filename;

  @Nullable public Integer additions;
  @Nullable public Integer deletions;
  @Nullable public Integer changes;
  @Nullable public String status;
  @Nullable public String rawUrl;
  @Nullable public String blobUrl;
  @Nullable public String patch;

  @NotNull
  @Override
  public GithubFile create() {
    return new GithubFile(filename, additions, deletions, changes, status, rawUrl, patch);
  }
}
