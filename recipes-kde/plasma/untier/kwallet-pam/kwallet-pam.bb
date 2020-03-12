SUMMARY = "Unlock KWallet using PAM"
LICENSE = "LGPLv2.1"
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
SRC_URI[md5sum] = "3d4a0da1c90bffcd9e372fedeac87d4f"
SRC_URI[sha256sum] = "9f2bf284bde5c4f4518beac585ae05916656a9fd8d6d557dcf18f60aa386f705"
SRC_URI += "file://0001-use-pkgconfig-to-find-libgcrypt.patch"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
