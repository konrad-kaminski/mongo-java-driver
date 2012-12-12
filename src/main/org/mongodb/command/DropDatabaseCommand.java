/*
 * Copyright (c) 2008 - 2012 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.command;

import org.mongodb.CommandDocument;
import org.mongodb.MongoClient;
import org.mongodb.operation.MongoCommand;

public class DropDatabaseCommand extends AbstractCommand {
    public DropDatabaseCommand(final MongoClient mongoClient, final String database) {
        super(mongoClient, database);
    }

    @Override
    public MongoCommand asMongoCommand() {
        return new CommandDocument("dropDatabase", 1);
    }
}
