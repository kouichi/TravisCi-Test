/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 kouichi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jp.aknot.test.travisci.app.test;

import junit.framework.TestCase;

import jp.aknot.test.travisci.app.Calculator;

/**
 * Created by kouichi on 2014/04/28.
 */
public class CalculatorTest extends TestCase {
    private static final String TAG = "@" + CalculatorTest.class.getSimpleName();

    private Calculator calculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testDivide() throws Exception {
        assertEquals("通常", 0.5, calculator.divide(1, 2), 0.0001);
    }
}
