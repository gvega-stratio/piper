/*
 * Copyright 2016-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.creactiviti.piper.taskhandler.io;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.creactiviti.piper.core.task.TaskExecution;
import com.creactiviti.piper.core.task.TaskHandler;
import com.google.common.io.Files;

/**
 * @author Arik Cohen
 * @since Feb, 21 2020
 */
@Component("io/createTempDir")
class CreateTempDir implements TaskHandler<String> {

  @Override
  public String handle (TaskExecution aTask) throws IOException {
    return Files.createTempDir().getAbsolutePath();
  }
  
}
