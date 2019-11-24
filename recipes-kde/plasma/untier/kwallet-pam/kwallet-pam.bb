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
SRC_URI[md5sum] = "61c93e0714314bc5c9b9313d68eb979c"
SRC_URI[sha256sum] = "7b3f20bf1a1ed35293fe82359ec069879dcca6b71f8622e2706c6f48477100f0"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
