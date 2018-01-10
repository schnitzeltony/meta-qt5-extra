SUMMARY = "Unlock KWallet using PAM"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "pam"

inherit kde-plasma distro_features_check

DEPENDS += " \
    libpam \
    libgcrypt \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "fae875d4ca60a24053db8d7b35f9fc92"
SRC_URI[sha256sum] = "84a9b2dcb48c35287f7f71b0bb392ca2a41159c5b05a72ec139f32bebf561673"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
FILES_${PN}-dbg += "${base_libdir}/security/.debug"
