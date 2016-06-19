SUMMARY = "Documentation generation from docbook"
LICENSE = "MIT | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://LICENSE;md5=d975629b732b61cb58f9595c6baa9379 \
"

inherit kde-kf5 perlnative

# allarch recipes
DEPENDS += "docbook-xml-dtd4 docbook-xsl-stylesheets liburi-perl-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4db500f1850f6138172249ba4fabd926"
SRC_URI[sha256sum] = "a0fedf272433204334204b220f4fed2c3ab64167e08ea004f74088645f7cf7c5"

SRC_URI += " \
	file://0001-Add-cmdline-param-to-help-find-xsl.patch \
	file://0002-build-meinproc5-it-works-fine-in-our-environment.patch \
"

# allarch packages do only install into machine sysroot
# for xml4
OECMAKE_EXTRA_ROOT_PATH = "${STAGING_DIR}/${MACHINE}"
# for xsl (we have to hardcode /usr - ${prefix} is aligned by native.bbclase
EXTRA_OECMAKE += "-DOE_ROOT_PATH_PREFIX=${STAGING_DIR}/${MACHINE}/usr"

EXTRA_OECMAKE += "-DCMAKE_AR:FILEPATH=${AR}"

