SUMMARY = "Syndication Library"
LICENSE = "BSD-2-Clause & GPL-2.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    kcodecs \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "b037497b677684751162856808b05dc6eec67c8378cbabba16ecb74d7fff1b16"
