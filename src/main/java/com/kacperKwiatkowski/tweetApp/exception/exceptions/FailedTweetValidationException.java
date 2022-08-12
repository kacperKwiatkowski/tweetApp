package com.kacperKwiatkowski.tweetApp.exception.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class FailedTweetValidationException extends RuntimeException {

    private List<String> exceptionMessages;
}
