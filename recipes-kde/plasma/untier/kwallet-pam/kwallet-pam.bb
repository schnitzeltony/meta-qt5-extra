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
SRC_URI[md5sum] = "25db35f344bd12fdf6d6e54b87d4b90c"
SRC_URI[sha256sum] = "dafced390651e8c5f9572a9def3cdfbab003a32b1ced2711be31b41ab44d9e11"
SRC_URI += "file://0001-use-pkgconfig-to-find-libgcrypt.patch"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
