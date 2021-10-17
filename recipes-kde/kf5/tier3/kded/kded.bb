SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPL-2.0 & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += " \
    kconfig-native kconfig \
    kdoctools-native kdoctools \
    kcoreaddons-native kcoreaddons \
    kcrash \
    kdbusaddons \
    kinit \
    kservice \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "256bcaee8101bd3c9ec239bc3853fd8f7d5a98383858e509809a572a5a0bbca1"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${libdir}/libkdeinit5_kded5.so \
    ${systemd_user_unitdir} \
"
FILES:${PN}-dev = "${libdir}/cmake"
