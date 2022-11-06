SUMMARY = "A client for matrix, the decentralized communication protocol"
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
"

DEPENDS += " \
    kcoreaddons-native kcoreaddons \
    cmark \
    qtdeclarative \
    qtquickcontrols2 \
    qtmultimedia \
    qtsvg \
    kconfig-native \
    kirigami2 \
    ki18n \
    knotifications \
    qqc2-desktop-style \
    kdbusaddons \
    kitemmodels \
    kquickimageeditor \
    qtkeychain \
    libquotient \
"

inherit kde-base gettext gtk-icon-cache mime-xdg

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "8ee4b5f61db7d43c902115e0be01f2b587100183b382596473922e9a42749de6"
PV = "1.2.0"

FILES:${PN} += " \
    ${datadir}/knotifications5 \
"
