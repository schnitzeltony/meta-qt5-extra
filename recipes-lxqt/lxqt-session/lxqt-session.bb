SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    qtxdg-tools-native \
    procps \
    liblxqt \
    kwindowsystem \
"

SRC_URI += "file://0001-do-not-check-for-xdg-udser-dirs-at-build-time-it-is-.patch \
            file://reaper-build-run-on-systems-with-procps-ng-4.0.0.patch"
SRCREV = "55aa4bba19814ff678e6693e8b9c423455e8eccc"
PV = "1.2.0"

FILES:${PN} += " \
    ${datadir}/lxqt/*.conf \
    ${datadir}/xsessions \
    ${datadir}/kdm \
"

RDEPENDS:${PN} += "xdg-user-dirs"
