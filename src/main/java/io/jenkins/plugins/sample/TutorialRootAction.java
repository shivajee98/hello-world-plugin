package io.jenkins.plugins.sample;
import hudson.Extension;
import hudson.model.RootAction;

@Extension
public class TutorialRootAction implements RootAction {
    @Override
    public String getIconFileName() {
        return "clipboard.png";
    }

    @Override
    public String getDisplayName() {
        return "Tutorial Jenkins Plugin Development";
    }
    @Override
    public String getUrlName() {
        return "https://google.com";
    }
}
