/*
 *  Copyright 2018 Edwin Njeru
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.ghacupha.keeper.book.util;

import io.github.ghacupha.keeper.book.Account;
import io.github.ghacupha.keeper.book.Entry;
import io.github.ghacupha.keeper.book.Transaction;

import java.util.Currency;

/**
 * Thrown when the {@link Entry} being added to an {@link Account} has {@link Currency} that
 * differs to that of the {@link Account}, or when the {@link Currency} of the {@link Account}
 * and {@link Entry} being added to a {@link Transaction} are different
 *
 * @author edwin.njeru
 */
public class MismatchedCurrencyException extends Throwable {
    private static final long serialVersionUID = 2585125223615187597L;

    public MismatchedCurrencyException(String message) {
        super(message);
    }
}
