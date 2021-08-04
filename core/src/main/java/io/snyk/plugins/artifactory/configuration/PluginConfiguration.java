package io.snyk.plugins.artifactory.configuration;

public enum PluginConfiguration implements Configuration {
  // general settings
  API_URL("snyk.api.url", "https://snyk.io/api/v1/"),
  API_TOKEN("snyk.api.token", ""),
  API_ORGANIZATION("snyk.api.organization", ""),
  API_SSL_CERTIFICATE_PATH("snyk.api.sslCertificatePath", ""),
  API_TRUST_ALL_CERTIFICATES("snyk.api.trustAllCertificates", "false"),

  // scanner module
  SCANNER_BLOCK_ON_API_FAILURE("snyk.scanner.block-on-api-failure", "true"),
  SCANNER_VULNERABILITY_THRESHOLD("snyk.scanner.vulnerability.threshold", "low"),
  SCANNER_LICENSE_THRESHOLD("snyk.scanner.license.threshold", "low"),
  SCANNER_PACKAGE_TYPE_MAVEN("snyk.scanner.packageType.maven", "true"),
  SCANNER_PACKAGE_TYPE_NPM("snyk.scanner.packageType.npm", "true"),
  SCANNER_PACKAGE_TYPE_PYPI("snyk.scanner.packageType.pypi", "true");

  private final String propertyKey;
  private final String defaultValue;

  PluginConfiguration(String propertyKey, String defaultValue) {
    this.propertyKey = propertyKey;
    this.defaultValue = defaultValue;
  }

  @Override
  public String propertyKey() {
    return propertyKey;
  }

  @Override
  public String defaultValue() {
    return defaultValue;
  }
}
