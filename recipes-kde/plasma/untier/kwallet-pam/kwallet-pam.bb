SUMMARY = "Unlock KWallet using PAM"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "pam"

inherit kde-plasma features_check

DEPENDS += " \
    libpam \
    libgcrypt \
    kwallet \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "864717b9082e83bf93f0d9fbf8c31adf31c64af2fc4729cbaf67982fba93ff8b"
SRC_URI += "file://0001-use-pkgconfig-to-find-libgcrypt.patch"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
