SUMMARY = "Support for application crash analysis and bug report from apps"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "kcoreaddons kcoreaddons-native kwindowsystem virtual/libx11"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "48c7792ca8c2ad6e9b6c8e9a260cdfcee5ed8d8769c4a8a199de7bf671f03cf5"
