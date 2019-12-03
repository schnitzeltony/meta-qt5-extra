SUMMARY = "Fast, Simple and Powerful report generator"
DESCRIPTION = "Fast, Simple and Powerful report generator. Injects JSON and produces PDF, DOCX, XLSX, ODT, PPTX, ODS, ...!"
HOMEPAGE = "https://carbone.io"
LICENSE = "MIT & ISC & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/which/node_modules/isexe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/timsort/LICENSE.md;md5=1a4424c73be0822c92e2c175d58f1d23 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/yauzl/LICENSE;md5=e62df7ee79458f947161db54ea09ad4d \
                    file://node_modules/yauzl/node_modules/fd-slicer/LICENSE;md5=5bbc2685b76c055f7adef651da1241ca \
                    file://node_modules/yauzl/node_modules/fd-slicer/node_modules/pend/LICENSE;md5=e8a22696b017d8f536112ef54c81f3fa \
                    file://node_modules/yauzl/node_modules/buffer-crc32/LICENSE;md5=b27a845c0955487ec9ca7b4ff7295b2b \
                    file://node_modules/moment/LICENSE;md5=397bb5fedab22612d8d69f1458a9321e"

SRC_URI = "git://github.com/Ideolys/carbone.git"
PV = "1.2.1+git${SRCPV}"
SRCREV = "945d64f54e1ede8420c41dc9ac11ac8b56cef7fa"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/git"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-moment = "MIT"
LICENSE_${PN}-moxie-zip = "MIT"
LICENSE_${PN}-timsort = "MIT"
LICENSE_${PN}-which-isexe = "ISC"
LICENSE_${PN}-which = "ISC"
LICENSE_${PN}-yauzl-buffer-crc32 = "MIT"
LICENSE_${PN}-yauzl-fd-slicer-pend = "MIT"
LICENSE_${PN}-yauzl-fd-slicer = "MIT"
LICENSE_${PN}-yauzl = "MIT"
LICENSE_${PN} = "Apache-2.0"


