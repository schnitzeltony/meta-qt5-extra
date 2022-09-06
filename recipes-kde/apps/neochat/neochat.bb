SUMMARY = "A client for matrix, the decentralized communication protocol"
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
"

DEPENDS += " \
    qtdeclarative \
    qtquickcontrols2 \
    qtmultimedia \
    qtsvg \
    kconfig-native \
    kirigami2 \
    ki18n \
    knotifications \
    kcoreaddons \
    kdbusaddons \
    qtkeychain \
    libquotient \
    cmark \
"

inherit kde-base gettext

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "f432b780368335674aa019043090c921e0abc7f06c4097153bcaa79754ed141f"
PV = "1.0.1"
