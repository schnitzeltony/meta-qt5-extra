SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "a5fc23a4db4ac2e54e430ae6ecdec30fa508c6d1"
PV = "0.17.0"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
