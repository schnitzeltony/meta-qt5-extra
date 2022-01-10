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
SRC_URI[sha256sum] = "faea3349e15c9c671c33172020787cb2e76f7809231c9d15ebac347bd0358f24"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

FILES:${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${libdir}/libkdeinit5_kded5.so \
    ${systemd_user_unitdir} \
"
FILES:${PN}-dev = "${libdir}/cmake"
