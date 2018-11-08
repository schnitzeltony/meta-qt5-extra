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
SRC_URI[md5sum] = "d818ca0174afbdb25cd4f89b4584ca2c"
SRC_URI[sha256sum] = "ef16ed87b32754923baf3749d27968aa6be2547c92e05c6a0d0cace4b8fb3281"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
FILES_${PN}-dbg += "${base_libdir}/security/.debug"
