package com.rusgall;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.InjectSoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SoftAssertionsExtension.class)
public class SoftAssertionTest {

    @InjectSoftAssertions private SoftAssertions softAssertions;

    @Test
    @DisplayName("Test 1")
    void test1() {
        softAssertions.assertThat("Test 1").as("Test 1").isEqualTo("Fail");
    }

    @Test
    @DisplayName("Test 2")
    void test2() {
        softAssertions.assertThat("Test 2").as("Test 2").isEqualTo("Fail");
    }
}