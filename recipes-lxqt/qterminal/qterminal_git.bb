SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit cmake_qt5 cmake_extra_sanity distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS = "qtbase qttools-native qtermwidget"

SRC_URI = "git://github.com/lxde/${BPN}.git"
SRCREV = "7f2c9e03e193df4d98cfb665d2acfa45e7153d91"
PV = "0.6.0+git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DUSE_SYSTEM_QXT=OFF -DUSE_QT5=ON"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/icons \
"
