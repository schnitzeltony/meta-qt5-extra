SUMMARY = "Multi-platform app that allows your devices to communicate"
LICENSE = "Apache-2.0 & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/Artistic-2.0.txt;md5=7f086b1df814d268c59965d8db41f13c \
    file://LICENSES/BSD-3-Clause.txt;md5=f225922a2c12dfa5218fb70c49db3ea6 \
    file://LICENSES/GPL-2.0-only.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/GPL-3.0-only.txt;md5=49fc03046e56a282c0c743b5d3a55b7c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
    file://LICENSES/LGPL-2.1-only.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
    file://LICENSES/LGPL-3.0-only.txt;md5=8d51f5b5fd447f7a1040c3dc9f0a8de6 \
    file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663 \
"

inherit kde-apps

DEPENDS += " \
    kdoctools-native \
    kpackage-native \
    qca \
    pulseaudio-qt \
    ki18n \
    kconfigwidgets \
    kdbusaddons \
    kiconthemes \
    knotifications \
    kio \
    kcmutils \
    kservice \
    solid \
    kirigami2 \
    kpeople \
    kwindowsystem \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "c10924777c204e4d48e126afa8c3c9b4f5816a1b493f8e3658e88652624f4eb3"

EXTRA_OECMAKE += " \
"

FILES:${PN} += " \
"
