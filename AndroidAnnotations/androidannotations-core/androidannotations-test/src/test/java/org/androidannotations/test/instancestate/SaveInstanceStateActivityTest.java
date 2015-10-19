/**
 * Copyright (C) 2010-2015 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.test.instancestate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.os.Bundle;

@RunWith(RobolectricTestRunner.class)
public class SaveInstanceStateActivityTest {

	@Test
	public void canCreateWithEmptyBundle() {
		Robolectric.buildActivity(SaveInstanceStateActivity_.class).create(new Bundle());
	}

	@Test
	public void canCreateWithoutSavedState() {
		Robolectric.buildActivity(SaveInstanceStateActivity_.class).create();
	}

	@Test
	public void bundleFieldWithBundleNameDoesNotCauseStackoverflow() {
		Robolectric.buildActivity(SaveInstanceStateActivity_.class).saveInstanceState(new Bundle());
	}
}
