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
import io.github.ghacupha.keeper.book.internal.AccountDetails;
import io.github.ghacupha.keeper.book.Entry;
import io.github.ghacupha.keeper.book.unit.time.TimePoint;

/**
 * This exception is thrown when the {@link TimePoint} bookingDate
 * of the {@link Entry} is sooner than the {@link TimePoint} openingDate attribute of the
 * {@link AccountDetails} attribute of an {@link Account}
 *
 * @author edwin.njeru
 */
public class UntimelyBookingDateException extends Throwable {

    private static final long serialVersionUID = -8350399456082375239L;

    public UntimelyBookingDateException(String message) {
        super(message);
    }
}