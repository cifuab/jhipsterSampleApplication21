package com.ic.cucumber.stepdefs;

import com.ic.JhipsterSampleApplication21App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleApplication21App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
