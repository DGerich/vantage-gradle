/*
 * Copyright 2016 Yodle, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yodle.vantage

import com.yodle.vantage.domain.Report
import groovy.json.JsonBuilder

class ReportPrinter {
  def printReport(File buildDir, Report report) {
    def outputFile = new File("${buildDir}/reports/vantage/${report.component}-${report.version}.vantage.json")
    outputFile.parentFile.mkdirs()
    outputFile.createNewFile()
    outputFile.text = new JsonBuilder(report)
  }
}
