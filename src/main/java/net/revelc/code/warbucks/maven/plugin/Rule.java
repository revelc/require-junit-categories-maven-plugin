/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.revelc.code.warbucks.maven.plugin;

public class Rule {

  private String classAnnotationPattern = null;
  private String classPattern = null;
  private boolean includeMainClasses = true;
  private boolean includeTestClasses = false;
  private boolean includePublicClasses = true;
  private boolean includePackagePrivateClasses = true;
  private boolean includeProtectedClasses = true;
  private boolean includePrivateClasses = true;

  public void setClassAnnotationPattern(String pattern) {
    classAnnotationPattern = pattern;
  }

  public String getClassAnnotationPattern() {
    return classAnnotationPattern;
  }

  public void setClassPattern(String pattern) {
    classPattern = pattern;
  }

  public String getClassPattern() {
    return classPattern;
  }

  public boolean getIncludeMainClasses() {
    return includeMainClasses;
  }

  public boolean getIncludeTestClasses() {
    return includeTestClasses;
  }

  public boolean getIncludePublicClasses() {
    return includePublicClasses;
  }

  public boolean getIncludePackagePrivateClasses() {
    return includePackagePrivateClasses;
  }

  public boolean getIncludeProtectedClasses() {
    return includeProtectedClasses;
  }

  public boolean getIncludePrivateClasses() {
    return includePrivateClasses;
  }
}
